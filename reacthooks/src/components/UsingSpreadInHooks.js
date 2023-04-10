import React, { useState } from 'react'

function UsingSpreadInHooks() {
    const [name, setName] = useState({ firstname: '', lastname: '' })
    return (
        <form>
            <input type='text' value={name.firstname} onChange={e => setName({ ...name, firstname: e.target.value })} />
            <input type='text' value={name.lastname} onChange={e => setName({ ...name, lastname: e.target.value })} />
           
            <div>
                <h2>Your First Name:{name.firstname}</h2>
            </div>
            <div>
                <h2>Your Last Name:{name.lastname}</h2>
            </div>
    </form>
    )
}

export default UsingSpreadInHooks
